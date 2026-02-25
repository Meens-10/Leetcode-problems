/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int firstVs = 1;
        int lastVs = n;
        int badVs = 1;

        while( firstVs <= lastVs){
            int midVs = firstVs + (lastVs - firstVs)/2;

            boolean check = isBadVersion(midVs);
            if(check){
                badVs = midVs;
                lastVs = midVs -1;

            }else{
                firstVs = midVs + 1;
            }
        }
        return badVs;
    }
}