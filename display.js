class SLLNode {
    constructor(val) {
        this.value = val;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null; 
    }

    addFront(value) {
        var newNode = new SLLNode(value); 
        newNode.next = this.head; 
        this.head = newNode; 
        return this.head; 
    }

    removeFront() {
        if (this.head == null) { 
            return this.head;
        }
        var removedNode = this.head; 
        this.head = removedNode.next; 
        removedNode.next = null;
        return this.head;
    }

    front() {
        if (this.head == null) {
            return null;
        } else {
            return this.head.value;
        }
    }

    display(){
        var listStr = "";
        if(this.head == null){
            return listStr;
        }

        listStr += this.head.value;
        runner = this.head.next;

        while(runner != null){
            listStr = ", " + runner.value;
            runner = runner.next;
        }
        return listStr;
    }
}

var mySLL = new SLL();
    mySLL.addFront(10);
    mySLL.addFront(5);
    mySLL.addFront(3);

    mySLL.removeFront

    console.log(mySLL);
    console.log(mySLL.head.next);