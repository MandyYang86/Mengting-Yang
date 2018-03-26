from __future__ import print_function
# import argparse
import json
# import pprint
import requests
# import sys
import urllib
import os
# import math, re, types, datetime, random, time, unicodedata, optparse
from datetime import timedelta
import datetime
# from urllib.error import HTTPError
# from urllib.parse import quote
# from urllib.parse import urlencode
import pandas as pd
import sqlite3
from pandas.io import sql
from pandas.io.json import json_normalize
# pip install uber-rides
from uber_rides.session import Session as uber_Session
from uber_rides.client import UberRidesClient
# conda install -c conda-forge geopy
from geopy.distance import vincenty
import csv
from lyft_rides.auth import ClientCredentialGrant
from lyft_rides.session import Session as lyft_Session
from lyft_rides.auth import AuthorizationCodeGrant
from lyft_rides.client import LyftRidesClient

# Uber API

conn = sqlite3.connect('yelp.db')
cur = conn.cursor()
session = uber_Session(server_token='Uvu3eEPnLtPKCbTU7KrCko5jo1ua4CVgYAqd0JfO')
client = UberRidesClient(session)

auth_flow = ClientCredentialGrant(
    		'gRUenY4LPYg_',
    		'dFyiT-f23Jwmo_A7n2xGfzp_WcWvBIi8',
    		'public',
    		)
lyft_session = auth_flow.get_session()

class Yelp:

	def yelp_query(self, distance):

		self.df1 = pd.read_sql_query("SELECT name, coordinates_latitude, coordinates_longitude, location_address1, location_address2, location_address3, location_city, location_state, location_zip_code, location_country FROM yelp_businesses ORDER BY RANDOM() LIMIT 1;", conn)
		self.df2 = pd.read_sql_query('SELECT name, coordinates_latitude, coordinates_longitude, location_address1, location_address2, location_address3, location_city, location_state, location_zip_code, location_country FROM yelp_businesses where name IN (SELECT name FROM yelp_businesses ORDER BY RANDOM() LIMIT 1)', conn)
		self.start_loc = (self.df1['coordinates_latitude'][0], self.df1['coordinates_longitude'][0])
		self.end_loc = (self.df2['coordinates_latitude'][0], self.df2['coordinates_longitude'][0])
		self.distance = vincenty(self.start_loc, self.end_loc).miles	def distance(self):		yelp_query()		distance2()		
		while (self.distance < 1):			print('self.distance is less than 1')
			yelp_query()			distance2()	def distance2(self):
		if (self.distance > 1):
			response = client.get_price_estimates(
			start_latitude= self.df1['coordinates_latitude'][0],
			start_longitude= self.df1['coordinates_longitude'][0],
			end_latitude=  self.df2['coordinates_latitude'][0],
			end_longitude= self.df2['coordinates_longitude'][0]
			)
			uber_rides = response.json.get("prices")
			dt = datetime.datetime.now()    			# weather api			
			lat=str(self.df1['coordinates_latitude'][0])			long=str(self.df1['coordinates_longitude'][0])			api_address='http://api.openweathermap.org/data/2.5/weather?lat='+lat+'&lon='+long+'&appid=119fe664452f079528a64467c793dd7d&q='			weather_data = requests.get(api_address).json()			weather_data['weather'] = weather_data['weather'][0]['main']			df_weather = json_normalize(weather_data)			df_weather.columns = df_weather.columns.str.replace(r'[.]', '_')			df_weather = df_weather[['weather', 'main_temp', 'main_temp_max', 'main_temp_min']]
			for rides in uber_rides:
				rides["time"] = dt.strftime('%H:%M:%S')
				rides['day'] = dt.strftime('%A')
				rides['date'] = dt.strftime('%B %d, %Y')
				rides["start_latitude"] = self.df1['coordinates_latitude'][0]
				rides["start_longitude"] = self.df1['coordinates_longitude'][0]
				rides["end_latitude"] = self.df2['coordinates_latitude'][0]
				rides["end_longitude"] = self.df2['coordinates_longitude'][0]
				rides['self.start_location'] = self.df1['name'][0]
				rides['self.end_location'] = self.df2['name'][0]								rides['weather'] = df_weather['weather']								rides['main_temp'] = df_weather['main_temp']
				rides['main_temp_max'] = df_weather['main_temp_max']								rides['main_temp_min'] = df_weather['main_temp_min']
			df_uber = pd.DataFrame(uber_rides)
					
			with open('uber.csv', 'a') as f:
				df_uber.to_csv(f, sep=',', encoding='utf-8', index=False, header=False)		
			
			lyft_client=LyftRidesClient(lyft_session)
			lyft_price_response = lyft_client.get_cost_estimates(
			start_latitude= self.df1['coordinates_latitude'][0],
			start_longitude= self.df1['coordinates_longitude'][0],
			end_latitude=  self.df2['coordinates_latitude'][0],
			end_longitude= self.df2['coordinates_longitude'][0]
			)
			
			lyft_rides = lyft_price_response.json.get("cost_estimates")
			
			for rides in lyft_rides:
				rides["time"] = dt.strftime('%H:%M:%S')
				rides['day'] = dt.strftime('%A')
				rides['date'] = dt.strftime('%B %d, %Y')
				rides["start_latitude"] = self.df1['coordinates_latitude'][0]
				rides["start_longitude"] = self.df1['coordinates_longitude'][0]
				rides["end_latitude"] = self.df2['coordinates_latitude'][0]
				rides["end_longitude"] = self.df2['coordinates_longitude'][0]				
			df_lyft = pd.DataFrame(lyft_rides)
			with open('lyft.csv', 'a') as f:
				 df_lyft.to_csv(f, sep=',', encoding='utf-8', index=False, header=False)				else:			self.distance()
	#y = Yelp()					
	#y.yelp_query()


























