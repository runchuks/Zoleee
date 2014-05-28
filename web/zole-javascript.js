/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var username = ".nnnnn";
function GetName(){
    console.log("Izsauc GetName()");
    window.username = document.getElementById("username").value;
    console.log("Ievaditais  vards " + window.username);
    //document.getElementById('player-me').innerHTML = username;
    console.log(window.username);
}
function SetName(){
    username = "ffdgdfg";
    //console.log(window.username);
    //console.log("Izsuaca SetName()" + window.username);
    document.getElementById('player-me').innerHTML = username;
}

