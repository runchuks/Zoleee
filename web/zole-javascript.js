/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var username = "";
function GetName(){
    console.log("Izsauc GetName()");
    username = document.getElementById("username").value;
    console.log("Ievaditais  vards " + username);
    //document.getElementById('player-me').innerHTML = username;
}

function SetName(){
    console.log("Izsuaca SetName()");
    document.getElementById('player-me').innerHTML = username;
}

