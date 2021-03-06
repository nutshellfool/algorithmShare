package me.lirui.algo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeetCodeBacktrackingSolutionTest {

  private LeetCodeBacktrackingSolution mSolution;

  @Before
  public void setUp() {
    mSolution = new LeetCodeBacktrackingSolution();
  }

  @Test
  public void combine() {
    List<List<Integer>> expectList = new ArrayList<>();
    List<Integer> itemList = new ArrayList<>();
    Collections.addAll(itemList, 2, 4);
    expectList.add(itemList);
    List<Integer> itemList1 = new ArrayList<>();
    Collections.addAll(itemList1, 3, 4);
    expectList.add(itemList1);
    List<Integer> itemList2 = new ArrayList<>();
    Collections.addAll(itemList2, 2, 3);
    expectList.add(itemList2);
    List<Integer> itemList3 = new ArrayList<>();
    Collections.addAll(itemList3, 1, 2);
    expectList.add(itemList3);
    List<Integer> itemList4 = new ArrayList<>();
    Collections.addAll(itemList4, 1, 3);
    expectList.add(itemList4);
    List<Integer> itemList5 = new ArrayList<>();
    Collections.addAll(itemList5, 1, 4);
    expectList.add(itemList5);

    List<List<Integer>> resultList = mSolution.combine(4, 2);
    Assert.assertNotNull(resultList);
    Assert.assertEquals(expectList.size(), resultList.size());
    Assert.assertTrue(expectList.containsAll(resultList) && resultList.containsAll(expectList));
  }

  @Test
  public void subsets() {
    int[] nums = {1, 2, 3};
    List<List<Integer>> subsets = mSolution.subsets(nums);
    List<List<Integer>> expected = new ArrayList<>(8);
    List<Integer> itemList0 = new ArrayList<>();
    Collections.addAll(itemList0, 3);
    expected.add(itemList0);
    List<Integer> itemList1 = new ArrayList<>();
    Collections.addAll(itemList1, 1);
    expected.add(itemList1);
    List<Integer> itemList2 = new ArrayList<>();
    Collections.addAll(itemList2, 2);
    expected.add(itemList2);
    List<Integer> itemList3 = new ArrayList<>();
    Collections.addAll(itemList3, 1, 2, 3);
    expected.add(itemList3);
    List<Integer> itemList4 = new ArrayList<>();
    Collections.addAll(itemList4, 1, 3);
    expected.add(itemList4);
    List<Integer> itemList5 = new ArrayList<>();
    Collections.addAll(itemList5, 2, 3);
    expected.add(itemList5);
    List<Integer> itemList6 = new ArrayList<>();
    Collections.addAll(itemList6, 1, 2);
    expected.add(itemList6);
    List<Integer> itemList7 = new ArrayList<>();
    expected.add(itemList7);
    Assert.assertNotNull(subsets);
    Assert.assertEquals(expected.size(), subsets.size());
    Assert.assertTrue(expected.containsAll(subsets));
    Assert.assertTrue(subsets.containsAll(expected));
  }

  @Test
  public void subsetsWithDup() {
    int[] nums = {1, 2, 2};
    List<List<Integer>> subsets = mSolution.subsetsWithDup(nums);
    List<List<Integer>> expected = new ArrayList<>(8);
    List<Integer> itemList0 = new ArrayList<>();
    Collections.addAll(itemList0, 2);
    expected.add(itemList0);
    List<Integer> itemList1 = new ArrayList<>();
    Collections.addAll(itemList1, 1);
    expected.add(itemList1);
    List<Integer> itemList3 = new ArrayList<>();
    Collections.addAll(itemList3, 1, 2, 2);
    expected.add(itemList3);
    List<Integer> itemList4 = new ArrayList<>();
    Collections.addAll(itemList4, 2, 2);
    expected.add(itemList4);
    List<Integer> itemList6 = new ArrayList<>();
    Collections.addAll(itemList6, 1, 2);
    expected.add(itemList6);
    List<Integer> itemList7 = new ArrayList<>();
    expected.add(itemList7);
    Assert.assertNotNull(subsets);
    Assert.assertEquals(expected.size(), subsets.size());
    Assert.assertTrue(expected.containsAll(subsets));
    Assert.assertTrue(subsets.containsAll(expected));
  }

  @Test
  public void restoreIpAddresses() {
    String[] addressArray = {"255.255.11.135", "255.255.111.35"};
    List<String> expectedAddressList = Arrays.asList(addressArray);
    String ipAddressString = "25525511135";
    List<String> addresses = mSolution.restoreIpAddresses(ipAddressString);
    Assert.assertNotNull(addresses);
    Assert.assertEquals(2, addresses.size());
    Assert.assertTrue(expectedAddressList.containsAll(addresses));
    Assert.assertTrue(addresses.containsAll(expectedAddressList));
  }

  @Test
  public void restoreIpAddresses1() {
    String[] addressArray = {"0.0.0.0"};
    List<String> expectedAddressList = Arrays.asList(addressArray);
    String ipAddressString = "0000";
    List<String> addresses = mSolution.restoreIpAddresses(ipAddressString);
    Assert.assertNotNull(addresses);
    Assert.assertEquals(1, addresses.size());
    Assert.assertTrue(expectedAddressList.containsAll(addresses));
    Assert.assertTrue(addresses.containsAll(expectedAddressList));
  }

  @Test
  public void restoreIpAddresses2() {
    String ipAddressString = "11111111111111";
    List<String> addresses = mSolution.restoreIpAddresses(ipAddressString);
    Assert.assertNotNull(addresses);
    Assert.assertEquals(0, addresses.size());
  }

  @Test
  public void exist() {
    char[][] board = {
        {'A', 'B', 'C', 'E'},
        {'F', 'S', 'C', 'S'},
        {'A', 'D', 'E', 'E'}
    };
    boolean exist = mSolution.exist(board, "ABCCED");
    Assert.assertTrue(exist);
  }

  @Test
  public void exist1() {
    char[][] board = {
        {'A', 'B', 'C', 'E'},
        {'F', 'S', 'C', 'S'},
        {'A', 'D', 'E', 'E'}
    };
    boolean exist = mSolution.exist(board, "SEE");
    Assert.assertTrue(exist);
  }

  @Test
  public void exist2() {
    char[][] board = {
        {'A', 'B', 'C', 'E'},
        {'F', 'S', 'C', 'S'},
        {'A', 'D', 'E', 'E'}
    };
    boolean exist = mSolution.exist(board, "ABCB");
    Assert.assertFalse(exist);
  }
  //[["C","A","A"],["A","A","A"],["B","C","D"]]
  //"AAB"

  @Test
  public void exist3() {
    char[][] board = {
        {'C', 'A', 'A'},
        {'A', 'A', 'A'},
        {'B', 'C', 'D'}
    };
    boolean exist = mSolution.exist(board, "AAB");
    Assert.assertTrue(exist);
  }

  @Test
  public void letterCombinations() {
    String[] expectedArray = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
    List<String> expectedList = Arrays.asList(expectedArray);
    List<String> combinations = mSolution.letterCombinations("23");
    Assert.assertNotNull(combinations);
    Assert.assertEquals(9, combinations.size());
    Assert.assertTrue(expectedList.containsAll(combinations));
    Assert.assertTrue(combinations.containsAll(expectedList));
  }

  @Test
  public void combinationSum() {
    int[] candidates = {2, 3, 6, 7};
    List<List<Integer>> combinations = mSolution.combinationSum(candidates, 7);
    List<List<Integer>> expected = new ArrayList<List<Integer>>() {{
      add(Collections.singletonList(7));
      add(Arrays.asList(2, 2, 3));
    }};
    Assert.assertNotNull(combinations);
    Assert.assertEquals(expected.size(), combinations.size());
    Assert.assertTrue(expected.containsAll(combinations));
    Assert.assertTrue(combinations.containsAll(expected));
  }

  @Test
  public void combinationSum2() {
    int[] candidates = {10, 1, 2, 7, 6, 1, 5};
    List<List<Integer>> combinations = mSolution.combinationSum2(candidates, 8);
    List<List<Integer>> expected = new ArrayList<List<Integer>>() {{
      add(Arrays.asList(1, 7));
      add(Arrays.asList(1, 2, 5));
      add(Arrays.asList(2, 6));
      add(Arrays.asList(1, 1, 6));
    }};
    Assert.assertNotNull(combinations);
    Assert.assertEquals(expected.size(), combinations.size());
    Assert.assertTrue(expected.containsAll(combinations));
    Assert.assertTrue(combinations.containsAll(expected));
  }

  @Test
  public void combinationSum2Case1() {
    int[] candidates = {2, 5, 2, 1, 2};
    List<List<Integer>> combinations = mSolution.combinationSum2(candidates, 5);
    List<List<Integer>> expected = new ArrayList<List<Integer>>() {{
      add(Arrays.asList(1, 2, 2));
      add(Collections.singletonList(5));
    }};
    Assert.assertNotNull(combinations);
    Assert.assertEquals(expected.size(), combinations.size());
    Assert.assertTrue(expected.containsAll(combinations));
    Assert.assertTrue(combinations.containsAll(expected));
  }

  @Test
  public void permute() {
    List<List<Integer>> expected = new ArrayList<List<Integer>>() {{
      add(Arrays.asList(1, 2, 3));
      add(Arrays.asList(1, 3, 2));
      add(Arrays.asList(2, 1, 3));
      add(Arrays.asList(2, 3, 1));
      add(Arrays.asList(3, 1, 2));
      add(Arrays.asList(3, 2, 1));
    }};
    int[] nums = {1, 2, 3};
    List<List<Integer>> permute = mSolution.permute(nums);
    Assert.assertNotNull(permute);
    Assert.assertEquals(expected.size(), permute.size());
    Assert.assertTrue(expected.containsAll(permute));
    Assert.assertTrue(permute.containsAll(expected));
  }

  @Test
  public void permuteUnique() {
    List<List<Integer>> expected = new ArrayList<List<Integer>>() {{
      add(Arrays.asList(1, 1, 2));
      add(Arrays.asList(1, 2, 1));
      add(Arrays.asList(2, 1, 1));
    }};
    int[] nums = {1, 1, 2};
    List<List<Integer>> permute = mSolution.permuteUnique(nums);
    Assert.assertNotNull(permute);
    Assert.assertEquals(expected.size(), permute.size());
    Assert.assertTrue(expected.containsAll(permute));
    Assert.assertTrue(permute.containsAll(expected));
  }

  @Test
  public void permuteUniqueCase1() {
    List<List<Integer>> expected = new ArrayList<List<Integer>>() {{
      add(Arrays.asList(0, 3, 3, 3));
      add(Arrays.asList(3, 0, 3, 3));
      add(Arrays.asList(3, 3, 0, 3));
      add(Arrays.asList(3, 3, 3, 0));
    }};
    int[] nums = {3, 3, 0, 3};
    List<List<Integer>> permute = mSolution.permuteUnique(nums);
    Assert.assertNotNull(permute);
    Assert.assertEquals(expected.size(), permute.size());
    Assert.assertTrue(expected.containsAll(permute));
    Assert.assertTrue(permute.containsAll(expected));
  }
}