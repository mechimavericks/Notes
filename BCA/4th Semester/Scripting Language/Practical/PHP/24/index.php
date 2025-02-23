<?php
    $arr=array("Santosh","Krishna","Uttam","Manoj","Krian");
    foreach($arr as $name){
        echo $name."<br/>";
    }
    echo "</br><br/>";
    $numbers = array(10,20,45,48,2,59,20);
    $sum=0;
    foreach($numbers as $n){
        $sum+=$n;
    }
    echo "Sum: ".$sum."</br><br/>";


    $info=array(
        "name"=>"Santosh",
        "age"=>25,
        "city"=>"Bangalore"
    );
    foreach($info as $key=>$value){
        echo "$key : $value <br/>";
    }

?>