package com.highpeak.assignment.hps313.prajwal.problem6;

import java.util.*;


public class MyLinkedList {
    Node head;
    private int size;
    public MyLinkedList(){
        size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add
    public void add(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //add First
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add Last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
       while(currNode.next!=null) {
           currNode=currNode.next;
       }
       currNode.next=newNode;
    }
    //delete
    public void delete(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    //delete First
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete last
    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }
    public int size(){
        return  size;
    }
    public static void main(String[] args) {
        MyLinkedList mylist=new MyLinkedList();
        mylist.addFirst("a");
        mylist.addFirst("is");
        mylist.addLast("list");
        mylist.addFirst("this");
        mylist.printList();
        mylist.deleteFirst();
        mylist.printList();
        mylist.delete();
        System.out.println(mylist.size());
        mylist.printList();
    }
}
