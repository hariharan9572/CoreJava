class Students{
    int rollno;
    String name;
    int score;
}

public class EnhancedForLoop { // for each loop
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.rollno=1;
        s1.name="Hari";
        s1.score=99;

        Students s2 = new Students();
        s2.rollno=1;
        s2.name="Divya";
        s2.score=88;

        Students s3 = new Students();
        s3.rollno=1;
        s3.name="Viji";
        s3.score=77;

        // System.out.println(s1);
        // System.out.println(s1.name+" : "+s1.score);

        Students students[] = new Students[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name+" : "+students[i].score);
        // }

        for(Students stud :  students){
            System.out.println(stud.name+" : "+stud.score);
        }

        // int nums[] = new int[4];

        // nums[0]=7;
        // nums[1]=3;
        // nums[2]=2;
        // nums[3]=4;

        // for(int i=0; i<=nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        // for (int n:nums){
        //     System.out.println(n);
        // }
    }
}
