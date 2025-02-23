//For index.html(home) Page
let name=document.getElementById("name");
let question=document.getElementById("question");
let problem=document.getElementById("problem");
let suggestion=document.getElementById("suggestion");
document.getElementById("send").addEventListener("click",function(e){
    console.log(document.getElementById("phone").value)
    let data=question.value.trim()+problem.value.trim()+suggestion.value.trim();
    e.preventDefault();
    if(name.value=="" || name.value==null){
        document.getElementById("nameerror").textContent="* Please Enter Your Name";
    }else{
        document.getElementById("nameerror").textContent="";
    }
    if(data==""||data==null){
        document.getElementById("textareaerror").textContent="* Please Fill one of the Field";
    }else{
        document.getElementById("textareaerror").textContent="";
    }
    if(data!="" && data!=null && name.value!="" && name.value!=null){
        document.getElementById("submit").click();
    }
})

