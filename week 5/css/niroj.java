
None selected

Skip to content
Using Gmail with screen readers
Conversations
14.67 GB of 15 GB (97%) used
Terms · Privacy · Programme Policies
Last account activity: 0 minutes ago
Details
import java.util.*;
public class MergeSort {
    public static void main(String[] args){
        ArrayList al= new ArrayList();
        MergeSort obj=new MergeSort();
        ArrayList list=obj.getinput(al);
        System.out.print("The unsortedList: ");
        output(list);
        int end=list.size();
        int beg=0;
        int mid;
        if (end%2==0){
            mid=end/2;
        }
        else{
            mid=(end+1)/2;
        }
        ArrayList final_list=obj.sort(list,beg,mid,end);
        System.out.println("");
        System.out.print("The sortedlist: ");
        output(final_list);
    }
    ArrayList sc=new ArrayList();
    ArrayList getinput(ArrayList<Integer>al){
        Scanner x= new Scanner(System.in);
        System.out.print("How many numbers you want in this list? ");
        int input= x.nextInt();
        int i=0;
        while (i<input){
            System.out.print("Enter any number to add in list: ");
            int number=x.nextInt();
            al.add(number);
            i++;
        }
        return al;
    }

    ArrayList merge(ArrayList<Integer>al,ArrayList<Integer>bl){
        ArrayList array= new ArrayList();
        int left_index=0;
        int right_index=0;
        while (left_index<al.size()&right_index<bl.size()){
            if (al.get(left_index)<bl.get(right_index)){
                array.add(al.get(left_index));
                left_index++;
            }
            else{
                array.add(bl.get(right_index));
                right_index++;
            }
        }
        while(left_index<al.size()){
            array.add(al.get(left_index));
            left_index++;
        }
        while(right_index<bl.size()){
            array.add(bl.get(right_index));
            right_index++;
        }
        return array;
    }
    static void output(ArrayList<Integer>al){
        for (int x=0;x<al.size();x++){
            System.out.print(al.get(x)+" ");
        }
    }

    ArrayList sort(ArrayList<Integer>al,int beg,int mid,int end){
        ArrayList first= new ArrayList();
        ArrayList second=new ArrayList();
        while(beg<mid){
            first.add(al.get(beg));
            beg++;
        }
        while(mid<end){
            second.add(al.get(mid));
            mid++;
        }
        if (first.size() != 1){
            int first_beg=0;
            int first_end=first.size();
            int first_mid;
            if (first_end%2==0){
                first_mid=first_end/2;
            }
            else {
                first_mid=(first_end+1)/2;
            }
            sort(first,first_beg,first_mid,first_end);
        }
        if (second.size() !=1){
            int second_beg=0;
            int second_end=second.size();
            int second_mid;
            if (second_end%2==0){
                second_mid=second_end/2;
            }
            else {
                second_mid=(second_end+1)/2;
            }
            sort(second,second_beg,second_mid,second_end);
        }
        if (first.size()!=1 & second.size()==1){
            ArrayList z=merge(sc,second);
            sc=z;
        }
        if (first.size()==1 & second.size()==1){
            ArrayList abc=merge(first,second);
            ArrayList z=merge(abc,sc);
            sc=z;
        }
        return sc;
    }
    


}
MergeSort.java
Page 1 of 3