import java.util.*;

class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long sumSkill = 0L;
        for (int x : skill) sumSkill += x;

        // prevWizardDone = completion time of the last wizard after scheduling j-1 potions
        long prevWizardDone = sumSkill * (long) mana[0];

        for (int j = 1; j < m; ++j) {
            long prevPotionDone = prevWizardDone;
            // iterate wizards from second-last down to first
            for (int i = n - 2; i >= 0; --i) {
                // remove the contribution of wizard i+1 for previous potion
                prevPotionDone -= (long) skill[i + 1] * mana[j - 1];
                // choose the earliest feasible completion time respecting constraints
                prevWizardDone = Math.max(prevPotionDone, prevWizardDone - (long) skill[i] * mana[j]);
            }
            // add the full processing time of potion j across all wizards
            prevWizardDone += sumSkill * (long) mana[j];
        }

        return prevWizardDone;
    }
}
