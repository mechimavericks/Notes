let colorList=['red','green','black','aqua','purple','mediumblue','grey','darkgrey','pink','yellow','lightyellow','lightgreen','lightblue'];
let i=0;
setInterval(function(){
    if(i==colorList.length)
        i=0;
    document.getElementById("body").style.background=colorList[i];
    i++;
},1000)