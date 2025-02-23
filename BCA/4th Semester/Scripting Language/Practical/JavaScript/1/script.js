document.getElementById("calc").addEventListener("click",function(){
    let n1=parseInt(document.getElementById("n1").value);
    let n2=parseInt(document.getElementById("n2").value);
    let op=document.getElementById("operation").value;
    let result=0;
    switch(op){
        case "+":
            result=n1+n2;
            break;
        case "-":
            result=n1-n2;
            break;    
        case "*":
            result=n1*n2;
            break;
        case "/":
            result=n1/n2;
            break;
    }
    document.getElementById("result").innerText="Result = "+result;
})