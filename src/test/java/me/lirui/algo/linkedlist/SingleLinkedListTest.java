package me.lirui.algo.linkedlist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * SingleLinkedList Tester.
 *
 * @author Richard Li
 * @since
 *     <pre>三月 21, 2017</pre>
 *
 * @version 1.0
 */
public class SingleLinkedListTest {

  private SingleLinkedList mSingleLinkedList;

  @Before
  public void before() {
    this.mSingleLinkedList = new SingleLinkedList();
    mSingleLinkedList.appendNodeToTail(1);
    mSingleLinkedList.appendNodeToTail(2);
    mSingleLinkedList.appendNodeToTail(3);
  }

  @After
  public void after() {
    this.mSingleLinkedList.clearList();
  }

  /** Method: getHeadNode() */
  @Test
  public void testGetHeadNode() {
    SingleLinkedNode headNode = mSingleLinkedList.getHeadNode();
    Assert.assertNotNull(headNode);
  }

  /** Method: appendNodeToTail(int value) */
  @Test
  public void testAppendNodeToTail() {
    mSingleLinkedList.appendNodeToTail(4);
    Assert.assertEquals(4, mSingleLinkedList.getSize());
  }

  /** Method: searchNode(int value) */
  @Test
  public void testSearchNodeExisted() {
    SingleLinkedNode foundNode = mSingleLinkedList.searchNode(2);
    Assert.assertNotNull(foundNode);
    Assert.assertEquals(2, foundNode.getValue());
    Assert.assertNotNull(foundNode.getNext());
    Assert.assertEquals(3, foundNode.getNext().getValue());
  }

  /** Method: searchNode(int value) */
  @Test
  public void testSearchNodeNotExisted() {
    SingleLinkedNode foundNode = mSingleLinkedList.searchNode(6);
    Assert.assertNull(foundNode);
  }

  /** Method: deleteNode(int value) */
  @Test
  public void testDeleteNode1stNode() {
    mSingleLinkedList.deleteNode(1);
    Assert.assertEquals(2, mSingleLinkedList.getSize());
    Assert.assertNotNull(mSingleLinkedList.getHeadNode());
    Assert.assertEquals(2, mSingleLinkedList.getHeadNode().getNext().getValue());
  }

  /** Method: deleteNode(int value) */
  @Test
  public void testDeleteNodeLastNode() {
    mSingleLinkedList.deleteNode(3);
    Assert.assertEquals(2, mSingleLinkedList.getSize());
    Assert.assertNotNull(mSingleLinkedList.searchNode(2));
    Assert.assertNull(mSingleLinkedList.searchNode(2).getNext());
  }

  @Test
  public void testHasCycleTrue1() {
    boolean hasCycle = mSingleLinkedList.hasCycle();
    Assert.assertFalse(hasCycle);
  }

  @Test
  public void testHasCycleTrue2() {
    boolean hasCycle = mSingleLinkedList.hasCycle2();
    Assert.assertFalse(hasCycle);
  }

  @Test
  public void testReverseList() {
    SingleLinkedNode reversedHead = mSingleLinkedList.reverseLinkList();
    _reverseListTestCase(reversedHead, mSingleLinkedList);
  }

  @Test
  public void testReverseListRecursionImpl() {
    SingleLinkedNode reversedHead = mSingleLinkedList.reverseLinkList_recursion();
    _reverseListTestCase(reversedHead, mSingleLinkedList);
  }

  @Test
  public void testMiddleNode() {
    SingleLinkedNode headNode = mSingleLinkedList.getHeadNode();
    SingleLinkedNode middleNode = mSingleLinkedList.middleNode(headNode.next);
    Assert.assertNotNull(middleNode);
    Assert.assertEquals(2, middleNode.getValue());
  }

  @Test
  public void testRemoveNthFromEnd() {
    SingleLinkedNode headNode = mSingleLinkedList.getHeadNode();
    SingleLinkedNode node = mSingleLinkedList.removeNthFromEnd(headNode.next, 2);
    // [1,3]
    Assert.assertNotNull(node);
    Assert.assertEquals(1, node.getValue());
    Assert.assertNotNull(node.next);
    Assert.assertEquals(3, node.next.getValue());
    Assert.assertNull(node.next.next);
  }

  private void _reverseListTestCase(SingleLinkedNode newHead, SingleLinkedList reversedList) {
    int listSize = reversedList.getSize();
    Assert.assertEquals(listSize, 3);
    Assert.assertNotNull(newHead);
    Assert.assertEquals(newHead.getValue(), 3);

    SingleLinkedNode reversed2nd = newHead.next;
    Assert.assertNotNull(reversed2nd);
    Assert.assertEquals(reversed2nd.getValue(), 2);

    SingleLinkedNode reversed3rd = reversed2nd.next;
    Assert.assertNotNull(reversed3rd);
    Assert.assertEquals(reversed3rd.getValue(), 1);

    SingleLinkedNode reversedEnd = reversed3rd.next;
    Assert.assertNotNull(reversedEnd);
    Assert.assertNull(reversedEnd.next);
  }
}
