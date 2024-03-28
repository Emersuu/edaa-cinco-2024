public class BuacaBinaria2 {
    public static void main(String[] args) {
        int[] arr = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
                      178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
                      243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
                      317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
                      396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
                      443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
                      525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
                      626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
                      723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
                      824, 826, 832, 848, 854, 856, 858, 867, 873, 880 };

        int[] numbersToFind = {824, 599, 700, 858, 269, 351, 42, 317, 525, 550, 143, 421, 422};

        for (int num : numbersToFind) {
            int index = binarySearch(arr, num);
            if (index != -1) {
                System.out.println("O número " + num + " foi encontrado no índice " + index + ".");
            } else {
                System.out.println("O número " + num + " não foi encontrado no array.");
            }
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
