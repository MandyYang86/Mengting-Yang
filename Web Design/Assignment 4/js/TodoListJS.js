

function readTextFile(file, callback) {
    var rawFile = new XMLHttpRequest();
    rawFile.overrideMimeType("application/json");
    rawFile.open("GET", file, true);
    rawFile.onreadystatechange = function() {
        if (rawFile.readyState === 4 && rawFile.status == "200") {
            callback(rawFile.responseText);
        }
    }
    rawFile.send(null);
}

//usage:
readTextFile("js/todolist.json", function(text){
    data = JSON.parse(text);
    todolists = data.todolists;

    list1 = todolists[0];
    list2 = todolists[1];
    list3 = todolists[2];

    console.log(list1.Title);

    readJSON1();
    readJSON2();
    readJSON3();
});


// Create a "close" button and append it to each list item
var myNodelist = document.getElementById("myUL").getElementsByTagName("li");
var i;
for (i = 0; i < myNodelist.length; i++) {
    var span = document.createElement("SPAN");
    var txt = document.createTextNode("\u00D7");
    span.className = "close";
    span.appendChild(txt);
    myNodelist[i].appendChild(span);
}
console.log(myNodelist);

// Click on a close button to hide the current list item
var close = document.getElementsByClassName("close");
var i;
for (i = 0; i < close.length; i++) {
    close[i].onclick = function() {
        var div = this.parentElement;
        div.style.display = "none";
    }
}
console.log(close);

// Add a "checked" symbol when clicking on a list item
var list = document.querySelector('#myUL');
console.log(list);
list.addEventListener('click', function(event) {
    if (event.target.tagName === 'LI') {
        event.target.classList.toggle('checked');
    }
}, false);


// Create a new list item when clicking on the "Add" button
function newElement() {
    var li1 = document.createElement("li");
    var li2 = document.createElement("li");
    var li3 = document.createElement("li");
    var li4 = document.createElement("li");

    var inputTitle = "Title: "+"  "+document.getElementById("myInput_Title").value;
    var inputItem = "Item: "+"  "+document.getElementById("myInput_Item").value;
    var inputAuthor = "Author: "+"  "+document.getElementById("myIput_Author").value;
    var inputDate = "Date: "+"  "+document.getElementById("myIput_Date").value;

    var t = document.createTextNode(inputTitle);
    li1.appendChild(t);

    var i = document.createTextNode(inputItem);
    li2.appendChild(i);

    var a = document.createTextNode(inputAuthor);
    li3.appendChild(a);

    var d = document.createTextNode(inputDate);
    li4.appendChild(d);


    if (inputTitle === '') {
        alert("You must write something!");
    } else {
        document.getElementById("myUL").appendChild(li1);
        document.getElementById("myUL").appendChild(li2);
        document.getElementById("myUL").appendChild(li3);
        document.getElementById("myUL").appendChild(li4);
    }


    document.getElementById("myInput_Title").value = "";
    document.getElementById("myInput_Item").value = "";
    document.getElementById("myIput_Author").value = "";
    document.getElementById("myIput_Date").value = "";

    var span1 = document.createElement("SPAN");
    var span2 = document.createElement("SPAN");
    var span3 = document.createElement("SPAN");
    var span4 = document.createElement("SPAN");

    var txt1 = document.createTextNode("\u00D7");
    var txt2 = document.createTextNode("\u00D7");
    var txt3 = document.createTextNode("\u00D7");
    var txt4 = document.createTextNode("\u00D7");

    span1.className = "close";
    span1.appendChild(txt1);

    span2.className = "close";
    span2.appendChild(txt2);

    span3.className = "close";
    span3.appendChild(txt3);

    span4.className = "close";
    span4.appendChild(txt4);


    li1.appendChild(span1);
    li2.appendChild(span2);
    li3.appendChild(span3);
    li4.appendChild(span4);


    for (i = 0; i < close.length; i++) {
        close[i].onclick = function() {
            var div = this.parentElement;
            div.style.display = "none";
        }
    }
}

// Create a new list item when clicking on the "Add" button


function readJSON1() {
    var li1 = document.createElement("li");
    var li2 = document.createElement("li");
    var li3 = document.createElement("li");
    var li4 = document.createElement("li");

    var inputTitle = "Title: "+"  "+list1.Title;
    var inputItem = "Item: "+"  "+list1.Items;
    var inputAuthor = "Author: "+"  "+list1.Author;
    var inputDate = "Date: "+"  "+list1.Date;

    var t = document.createTextNode(inputTitle);
    li1.appendChild(t);

    var i = document.createTextNode(inputItem);
    li2.appendChild(i);

    var a = document.createTextNode(inputAuthor);
    li3.appendChild(a);

    var d = document.createTextNode(inputDate);
    li4.appendChild(d);


    if (inputTitle === '') {
        alert("You must write something!");
    } else {
        document.getElementById("myUL").appendChild(li1);
        document.getElementById("myUL").appendChild(li2);
        document.getElementById("myUL").appendChild(li3);
        document.getElementById("myUL").appendChild(li4);
    }


    document.getElementById("myInput_Title").value = "";
    document.getElementById("myInput_Item").value = "";
    document.getElementById("myIput_Author").value = "";
    document.getElementById("myIput_Date").value = "";

    var span1 = document.createElement("SPAN");
    var span2 = document.createElement("SPAN");
    var span3 = document.createElement("SPAN");
    var span4 = document.createElement("SPAN");

    var txt1 = document.createTextNode("\u00D7");
    var txt2 = document.createTextNode("\u00D7");
    var txt3 = document.createTextNode("\u00D7");
    var txt4 = document.createTextNode("\u00D7");

    span1.className = "close";
    span1.appendChild(txt1);

    span2.className = "close";
    span2.appendChild(txt2);

    span3.className = "close";
    span3.appendChild(txt3);

    span4.className = "close";
    span4.appendChild(txt4);


    li1.appendChild(span1);
    li2.appendChild(span2);
    li3.appendChild(span3);
    li4.appendChild(span4);


    for (i = 0; i < close.length; i++) {
        close[i].onclick = function() {
            var div = this.parentElement;
            div.style.display = "none";
        }
    }
}

function readJSON2() {
    var li1 = document.createElement("li");
    var li2 = document.createElement("li");
    var li3 = document.createElement("li");
    var li4 = document.createElement("li");

    var inputTitle = "Title: "+"  "+list2.Title;
    var inputItem = "Item: "+"  "+list2.Items;
    var inputAuthor = "Author: "+"  "+list2.Author;
    var inputDate = "Date: "+"  "+list2.Date;

    var t = document.createTextNode(inputTitle);
    li1.appendChild(t);

    var i = document.createTextNode(inputItem);
    li2.appendChild(i);

    var a = document.createTextNode(inputAuthor);
    li3.appendChild(a);

    var d = document.createTextNode(inputDate);
    li4.appendChild(d);


    if (inputTitle === '') {
        alert("You must write something!");
    } else {
        document.getElementById("myUL").appendChild(li1);
        document.getElementById("myUL").appendChild(li2);
        document.getElementById("myUL").appendChild(li3);
        document.getElementById("myUL").appendChild(li4);
    }


    document.getElementById("myInput_Title").value = "";
    document.getElementById("myInput_Item").value = "";
    document.getElementById("myIput_Author").value = "";
    document.getElementById("myIput_Date").value = "";

    var span1 = document.createElement("SPAN");
    var span2 = document.createElement("SPAN");
    var span3 = document.createElement("SPAN");
    var span4 = document.createElement("SPAN");

    var txt1 = document.createTextNode("\u00D7");
    var txt2 = document.createTextNode("\u00D7");
    var txt3 = document.createTextNode("\u00D7");
    var txt4 = document.createTextNode("\u00D7");

    span1.className = "close";
    span1.appendChild(txt1);

    span2.className = "close";
    span2.appendChild(txt2);

    span3.className = "close";
    span3.appendChild(txt3);

    span4.className = "close";
    span4.appendChild(txt4);


    li1.appendChild(span1);
    li2.appendChild(span2);
    li3.appendChild(span3);
    li4.appendChild(span4);


    for (i = 0; i < close.length; i++) {
        close[i].onclick = function() {
            var div = this.parentElement;
            div.style.display = "none";
        }
    }
}

function readJSON3() {
    var li1 = document.createElement("li");
    var li2 = document.createElement("li");
    var li3 = document.createElement("li");
    var li4 = document.createElement("li");

    var inputTitle = "Title: "+"  "+list3.Title;
    var inputItem = "Item: "+"  "+list3.Items;
    var inputAuthor = "Author: "+"  "+list3.Author;
    var inputDate = "Date: "+"  "+list3.Date;

    var t = document.createTextNode(inputTitle);
    li1.appendChild(t);

    var i = document.createTextNode(inputItem);
    li2.appendChild(i);

    var a = document.createTextNode(inputAuthor);
    li3.appendChild(a);

    var d = document.createTextNode(inputDate);
    li4.appendChild(d);


    if (inputTitle === '') {
        alert("You must write something!");
    } else {
        document.getElementById("myUL").appendChild(li1);
        document.getElementById("myUL").appendChild(li2);
        document.getElementById("myUL").appendChild(li3);
        document.getElementById("myUL").appendChild(li4);
    }


    document.getElementById("myInput_Title").value = "";
    document.getElementById("myInput_Item").value = "";
    document.getElementById("myIput_Author").value = "";
    document.getElementById("myIput_Date").value = "";

    var span1 = document.createElement("SPAN");
    var span2 = document.createElement("SPAN");
    var span3 = document.createElement("SPAN");
    var span4 = document.createElement("SPAN");

    var txt1 = document.createTextNode("\u00D7");
    var txt2 = document.createTextNode("\u00D7");
    var txt3 = document.createTextNode("\u00D7");
    var txt4 = document.createTextNode("\u00D7");

    span1.className = "close";
    span1.appendChild(txt1);

    span2.className = "close";
    span2.appendChild(txt2);

    span3.className = "close";
    span3.appendChild(txt3);

    span4.className = "close";
    span4.appendChild(txt4);


    li1.appendChild(span1);
    li2.appendChild(span2);
    li3.appendChild(span3);
    li4.appendChild(span4);


    for (i = 0; i < close.length; i++) {
        close[i].onclick = function() {
            var div = this.parentElement;
            div.style.display = "none";
        }
    }
}

