<?php
    function Sum(...$numbers){
        $sum=0;
        foreach($numbers as $n)
            $sum=$sum+$n;
        echo "Sum : $sum <br/>";
    }
    Sum(1,2);
    Sum(1,3,4,2);
    Sum(1,6,8,2);
    Sum(1,4,6,9,8,2);
?>