package sort;

public class HeapSort {

    /**
     * 思想：<br>
     * 1.先建成一个二叉树<br>
     * 2.逐步升级：从最后一个节点开始与现存的最后一个非叶子节点比较大小，满足条件就交换<br>
     * 3.一直重复步骤2，直到把所有的非叶子节点跑完了<Br><br>
     * tips:对于一个数组(n为length)来说，其最后一个非叶子节点公式为：n/2-1
     */
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 8, 5, 9};

        int lastIndex = arr.length;
        //构造大顶堆
        for (int i = arr.length / 2; i >= 1; i = i / 2) {
            i = getLastNoneLeftNodeIndex(i);
            compareSwap(arr, i, lastIndex - 1);
            //lastIndex将变化
            lastIndex = i;
        }


    }

    private static int[] compareSwap(int[] arr, int lastNoneLeftNodeIndex, int i) {
        if (arr[lastNoneLeftNodeIndex] > arr[i]) {
            //do swap
            arr[i] ^= arr[lastNoneLeftNodeIndex];
            arr[lastNoneLeftNodeIndex] ^= arr[i];
            arr[i] ^= arr[lastNoneLeftNodeIndex];
        }
        return arr;
    }

    private static int getLastNoneLeftNodeIndex(int i) {
        if (i == 0) {
            return i;
        }
        return i - 1;
    }
}
