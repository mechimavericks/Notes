//For send.php(send) Page
let sec=4;
let countdown=setInterval(() => {
    if(sec==0){
        stopFunction();
    }
    document.getElementById("para").textContent=sec;
    sec--;
}, 1000);
function stopFunction(){
    document.getElementById("home").click();
    clearInterval(countdown);
    
}