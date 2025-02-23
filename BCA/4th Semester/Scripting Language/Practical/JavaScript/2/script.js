let btn=document.getElementsByTagName("button");
console.log(btn);
let value ="";
for(let i of btn){
    i.addEventListener("click",()=>{
        if(i.innerText=="="){
            value=eval(value);
        }else if(i.innerText=="AC"){
            value="0";
        }else{
            if(value=="0")
                value=""
            value+=i.innerText;
        }
        document.getElementById('output').value=value;
        if(i.innerText=="="){
            value="";
        }
    })
}