<?php
//Function Overloading
class shape{
    function __call($name_of_function, $arguments){
        if($name_of_function=="area"){
            switch(count($arguments)){
                case 1: 
                        return 3.14*$arguments[0];
                case 2:
                        return $arguments[0]*$arguments[1];
            }
        }
    }
    function getSum(){
        $sm=0;
        $args=func_get_args();
        if(empty($args))
            return 0;
        else   
            foreach($args as $arg)
                $sm+=$arg;
            return $sm;
    }
}
$s = new shape();
echo "Sum of One Parameter: ".($s->getSum(2));
echo "<br/>Sum of Two Parameter: ".($s->getSum(4,2));
echo "<br/>Sum of Three Parameter: ".($s->getSum(4,2,10));
?>