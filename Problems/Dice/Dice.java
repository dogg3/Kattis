import java.io.*;
import java.util.*;

class Dice {
    
    
    public static void main(String[] args) throws IOException{
        Scanner sc = null;
      

        try{
            int first = 0;
            int second = 0;
            sc = new Scanner(new FileReader("sample03.in"));
                while(sc.hasNext()){
                    first = sc.nextInt();
                    second = sc.nextInt();
                }

            int[] firstDie = new int[first];
            int[] secondDie = new int[second];

            for(int i=0; i<firstDie.length; i++){
                firstDie[i] = i+1;
            }
             for(int i=0; i<secondDie.length; i++){
                secondDie[i] = i+1;
            }



            HashMap<Integer,Integer> resultMap = new HashMap<>();

            for(int i = 0; i<firstDie.length;i++){
                for(int j=0; j<secondDie.length; j++){

                        int kkk =  firstDie[i] + secondDie[j];
                        if(!resultMap.containsKey(kkk)){
                         resultMap.put(kkk,1);

                        }else{
                            resultMap.put(kkk,resultMap.get(kkk)+1);
                        }
                }
            }

  
List<Integer> resultList = new LinkedList<>();
int number = 0;

for(Map.Entry entry: resultMap.entrySet()){
  
    if((int) entry.getValue()>number){
        number = (int) entry.getValue();
        resultList.clear();
        resultList.add((int) entry.getKey());
    }else if((int) entry.getValue()==number){
         resultList.add((int) entry.getKey());
    }else{
        resultList.remove(entry.getKey());
    }

}
    for(int n: resultList){
        System.out.println(n);

    }   

          
        }finally{

            sc.close();

        }

        }
        
    }