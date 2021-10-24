package com;
import java.lang.reflect.Array;
import java.util.*;




public class Lessons {
    private List<String> li;

    public Lessons(){
        li = new ArrayList<String>();
    }

    public static class undergraduate{         
        
        // private String s[] = {"Math", "Physics", "Introduction to Electronics"};
        // private String s2[] = {"Algebra", "Physics-cp-ug", "computer sciences"};
        private  List<String> ee;
        private  List<String> ce;

        public undergraduate(){   
            ee = new ArrayList<>();
            ce = new ArrayList<>();         
            // ee = Arrays.asList(s);
            // ce = Arrays.asList(s2);
        }        
        
        public List<String> get_ee_lessons(){
            return ee;
        }

        public List<String> get_ce_lessons(){
            return ce;
        }

        public void set_ee_lessons(List<String> ee){
            this.ee = ee;
        }

        public void set_ce_lessons(List<String> ce){
            this.ce = ce;
        }

        public void add(String item){
            ee.add(item);
            // try {
            //     if(major.equals("ee")){
            //         this.ee.add(item);  
            //     } 
            //     else if(major.equals("ce")){
            //         this.ce.add(item);
            //     }else{
            //         System.out.println("invalid major name. can't add lesson!!");
            //     }
            // } catch (Exception e) {
            //     System.out.println("couldn't add lesson!!"+ e.getMessage());
            // }
            
        }


    }

    
    public static class graduate{
        private Map<String, String[][]> m;   
        
        public graduate(){            
            m = new HashMap<String,String[][]>();
            m.put("electronic_engineering", new String[][]{{"Advanced-Math", "Advanced-Physics", "Advanced-Electronics"},
                                                {"graduate-Thesis-electrics"}}  );
            m.put("computer_engineering", new String[][]{{"Advanced-Algebra", "Advanced-Physics", "Advanced-Computer"},                                                
                                                {"graduate-Thesis-computer"}});
        }

        public Map<String, String[][]> getMap(){
            return m;
        }

        public void setMap(Map<String, String[][]> m){
            this.m = m;
        }

        public void add(){

        }

    }
    
    
    public static class phd{
        private Map<String, String[][]> m;   
        
        public phd(){            
            m = new HashMap<String,String[][]>();
            m.put("electronic_engineering", new String[][]{{"PHD-Math", "PHD-Physics", "PHD-Electronics"},
                                                {"PHD-Math-2", "PHD-Physics-2", "PHD-Electronics-2"},
                                                {"PHD-Thesis-3-electronics"},
                                                {"PHD-Thesis-4-electronics"}}  );
            m.put("computer_engineering", new String[][]{{"PHD-Algebra", "PHD-Physics", "PHD-Computer Sciences"},
                                                {"PHD-Algebra-2", "PHD-network-2", "PHD-Algorithms"},
                                                {"PHD-Thesis-3-computer"},
                                                {"PHD-Thesis-4-computer"}});
        }

        public Map<String, String[][]> getMap(){
            return m;
        }

        public void setMap(Map<String, String[][]> m){
            this.m = m;
        }


    }


    public void add(String item){
        this.li.add(item);
    }

    public List<String> getList(){
        return li;
    }

}



