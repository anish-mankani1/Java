package Section27collection_framework.model;

public class cat {


      public   String catname;


        //constructor

        public cat(String catname)
        {
            this.catname=catname;
        }

        public void makesound()
        {
            System.out.println("meow .........");
        }

        public String toString()
        {
            return this.catname;
        }

    }

