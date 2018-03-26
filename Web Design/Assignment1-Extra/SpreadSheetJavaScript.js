
//Delete the last row
function deleteRowFunction() {

    //get the table
    var table = document.getElementById("table");
    //console.log(table);
    var rowintable=document.getElementsByTagName("tr");

    //get the last row and its index
    var lastrow=rowintable[rowintable.length-1];
    var lastrowindex=rowintable.length-1;
    //console.log(lastrow);
    //console.log(lastrowindex);

    //delete the row
    table.deleteRow(lastrowindex);
}

//Add a new row at the bottom
function addRowFunction() {
    //get the table
    var table = document.getElementById("table");
    var rowintable=document.getElementsByTagName("tr");

    //get the last row and its index
    var lastrow=rowintable[rowintable.length-1];
    var lastrowindex=rowintable.length-1;

    //insert a new row
    var row = table.insertRow(lastrowindex+1);

    //count the number of columns
    var numberofcolumns=document.getElementById("table").rows[0].cells.length

    //add cells according to the column number
    for (var i =0; i < numberofcolumns;i++){
        //add new cell
        var newcell=row.insertCell(i);

        if(i==0){
            //get the number of rows in the table
            var numberofrows = document.getElementById("table").rows.length-1;

            //change the format of the first cell
            newcell.innerHTML=" <input type=\"button\" class=\"firstColBtn\" value="+numberofrows+" onclick=\"getTheSelectedRow(this)\">";
        }else {

            //set the format of each cell
            newcell.innerHTML = " <input type=\"text\" class=\"inputTable\" /> ";

            //set the class name of the cell
            newcell.className = "tdInRow";
        }
    }

}

//Add a new column on the right
function addColumnFunction() {
    //get the table
    var table = document.getElementById("table");

    //get all the rows in the table
    var rows=document.getElementsByTagName("tr");

    //get the number of columns
    var numberofcolumns=document.getElementById("table").rows[0].cells.length


    //add new column to first row

    //get the first new cell
    var firstnewcell= rows[0].insertCell(numberofcolumns);

    //get the order of alphabet
    var alphabet = ["A", "B", "C","D","E","F","G","H","I","J","K","L","M","N","H","I","J","K","L"];

    //get the value of the alphabet
    var valueofalp=alphabet[numberofcolumns-1];
    firstnewcell.innerHTML = " <input type=\"button\" class=\"firstRowBtn\" value="+valueofalp+" onclick=\"getTheSelectedCol(this)\">";
    firstnewcell.className = "tdInRowHead";

    //add new column to each row
    for(var i =1; i < rows.length;i++){
        var newcell=rows[i].insertCell(numberofcolumns);
        newcell.innerHTML = " <input type=\"text\" class=\"inputTable\" /> ";
        newcell.className = "tdInRow";
    }
}

//Delete a column on the right
function deleteColumnFunction(){
    //get the table
    var table = document.getElementById("table");

    //get all the rows in the table
    var rows=document.getElementsByTagName("tr");

    //get the number of columns
    var numberofcolumns=document.getElementById("table").rows[0].cells.length-1;


    //Delete a column on the right

    //delete the last cell of each row
    for(var i =0; i < rows.length;i++){
        var lastell=rows[i].deleteCell(numberofcolumns);
    }
}

//Get the data when select a row and calculate the sum
function getTheSelectedRow(obj) {
    var selectedelEmentIndex=obj.parentNode.parentNode.rowIndex;
    //console.log(obj.parentNode);

    //get all the rows in the table
    var rows=document.getElementsByTagName("tr");

    //get all the columns of this row
    var thiscolumns=document.getElementById("table").rows[selectedelEmentIndex].getElementsByTagName("input");
    console.log(thiscolumns);

    //get the number of columns
    var numberofcolumns=document.getElementById("table").rows[0].cells.length;

    //create an array to sum
    var sumarray=new Array();

    //get each cell input of this row
    for (var i=1; i <numberofcolumns; i++ ){

        var inputofcell=thiscolumns[i].value;

        if(inputofcell===""){
            //console.log("this is null");
        }else{
            sumarray.push(inputofcell);
        }
    }

    //console.log(sumarray);

    //caluculate the sum

    var sum=0;
    var lengthofarray=sumarray.length;

    for (var i=0; i <lengthofarray; i++ ){
        //console.log(sumarray[i]);
        var intsum=parseInt(sumarray[i]);
        sum=sum+intsum;
    }

    //get the number of rows
    var numberrows=rows.length;

    if(lengthofarray>numberrows-2){
        addColumnFunction();
        thiscolumns[lengthofarray+1].value=sum;
    }else{
        thiscolumns[lengthofarray+1].value=sum;
    }

    sumarray=[];
}

//Get the data when select a column and calculate the sum
function getTheSelectedCol(obj) {
    //get the selected column index
    var selcolumnindex=obj.parentNode.cellIndex;
    //console.log(selcolumnindex);

    //Get the cell of this index of each row

    //get all the rows in the table
    var rows=document.getElementsByTagName("tr");

    //create an array to sum
    var sumarraycol=new Array();

    //get the cell of row
    for (var i=1; i <rows.length; i++ ){
        var eachcell = rows[i].cells[selcolumnindex];
        var eachinput=eachcell.getElementsByTagName("input")[0];
        var iputvalue=eachinput.value;

        if(iputvalue===""){
            //console.log("this is null");
        }else{
            sumarraycol.push(iputvalue);
        }
    }

    //console.log(sumarraycol);

    //caluculate the sum

    var sum=0;
    var lengthofarray=sumarraycol.length;

    for (var i=0; i <lengthofarray; i++ ){
        //console.log(sumarray[i]);
        var intsum=parseInt(sumarraycol[i]);
        sum=sum+intsum;
    }

    //get the number of rows
    var numberrows=rows.length;


    //console.log(sumiput);

    if(lengthofarray>numberrows-2){
        addRowFunction();

        //get the specific cell input
        var sumiput=rows[lengthofarray+1].cells[selcolumnindex].getElementsByTagName("input")[0];
        sumiput.value=sum;
    }else{

        //get the specific cell input
        var sumiput=rows[lengthofarray+1].cells[selcolumnindex].getElementsByTagName("input")[0];

        sumiput.value=sum;
    }

    sumarraycol=[];
}

//Clear all the numbers in table
function clearFunction(){

    //get all the rows in the table
    var rows=document.getElementsByTagName("tr");
    //console.log(rows);

    //get the number of columns
    var numberofcolumns=document.getElementById("table").rows[0].cells.length;

    //get all the columns in the table
    for (var i=1; i <rows.length; i++ ){
        for(var j=1; j <numberofcolumns; j++ ) {
            var eachcell = rows[i].cells[j];
            var eachinput=eachcell.getElementsByTagName("input")[0];
            //console.log(eachinput);
            eachinput.value="";
        }
    }
}

//get the value of the first cell
function choosefirstCell() {
    //get all the rows in the table
    var rows=document.getElementsByTagName("tr");

    //get the number of columns
    var numberofcolumns=document.getElementById("table").rows[0].cells.length;

    //get all the columns in the table to add click event
    for (var i=1; i <rows.length; i++ ){
        for(var j=1; j <numberofcolumns; j++ ) {
            var eachcell = rows[i].cells[j];

            //get the input part of the cell
            var eachinput=eachcell.getElementsByTagName("input")[0];
            console.log(eachinput);

            //add click function
            eachinput.addEventListener("click",function (obj) {
                getvalue(this);
            })
        }
    }

    //define the getvalue function
    function getvalue(cel) {
        var valueofcel=cel.value;
        var firstcell=document.getElementById("firstcell");
        firstcell.value=valueofcel;
    }


}

//get the value of the second cell
function chooseSecondCell() {
    var valueoffirstcell=document.getElementById("firstcell").value;

    var tryyi=parseInt(valueoffirstcell);

    //get the number of columns
    var numberofcolumns=document.getElementById("table").rows[0].cells.length;


    //get all the rows in the table
    var rows=document.getElementsByTagName("tr");

    //get all the columns in the table to add click event
    for (var i=1; i <rows.length; i++ ){
        for(var j=1; j <numberofcolumns; j++ ) {
            var eachcell = rows[i].cells[j];

            //get the input part of the cell
            var eachinput=eachcell.getElementsByTagName("input")[0];
            //console.log(eachinput);

            //add click function
            eachinput.addEventListener("click",function (obj) {
                getvalue2(this);
            })
        }
    }

    //define the getvalue function
    function getvalue2(cel) {
        var valueofcel=cel.value;
        var secondcell=document.getElementById("secondcell");
        secondcell.value=valueofcel;

        var newfirst=valueoffirstcell=document.getElementById("firstcell").value;
        //console.log(tryyi);

        document.getElementById("firstcell").value=tryyi;

    }



}

//Calculate the Result
function calculateResult() {

    //get the value of each cell
    var valueoffirstcell=document.getElementById("firstcell").value;
    var valueofsecondcell=document.getElementById("secondcell").value;
    var operation=document.getElementById("opera").value;

    var numberfirst=parseInt(valueoffirstcell);
    var numbersecond=parseInt(valueofsecondcell);

    var result;

    //evaluate how to operate

    if(operation=="+"){
        result=numberfirst+numbersecond;
    }else if(operation=="-"){
        result=numberfirst-numbersecond;
    }else if(operation=="*"){
        result=numberfirst*numbersecond;
    }else if(operation=="/"){
        result=numberfirst/numbersecond;
    }else{
        alert("Please input the right operation")
    }

    document.getElementById("result").value=result;

}

//export to csv
function downloadCSV(csv, filename) {
    var csvFile;
    var downloadLink;

    // CSV file
    csvFile = new Blob([csv], {type: "text/csv"});

    // Download link
    downloadLink = document.createElement("a");

    // File name
    downloadLink.download = filename;

    // Create a link to the file
    downloadLink.href = window.URL.createObjectURL(csvFile);

    // Hide download link
    downloadLink.style.display = "none";

    // Add the link to DOM
    document.body.appendChild(downloadLink);

    // Click download link
    downloadLink.click();
}

function exportTableToCSV(filename) {
    var csv = [];
    var rows =document.getElementsByTagName("tr");

    //get the number of columns
    var numberofcolumns=document.getElementById("table").rows[0].cells.length;

    for (var i=0; i <rows.length; i++ ){
        var row = [];
        var thiscol=rows[i].cells;
        for(var j=0; j <numberofcolumns; j++ ) {
            row.push(thiscol[j].getElementsByTagName("input")[0].value);
        }
        console.log(row);
        csv.push(row.join(","));
    }

    // Download CSV file
    downloadCSV(csv.join("\n"), filename);
}
