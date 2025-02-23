     String temp;
        for(int i=0;i<7;i++){
            for(int j=i+1;j<6;j++){
                if((city[i].compareTo(city[j]))>0){
                    temp=city[i];
                    city[i]=city[j];
                    city[j]=temp;
                }
            }
            
        }