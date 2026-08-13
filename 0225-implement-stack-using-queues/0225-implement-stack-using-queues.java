// class MyStack {

//     Queue<Integer> q1 = new LinkedList<>();
//     Queue<Integer> q2 = new LinkedList<>();

//     public void push(int x) {

//         // Move q1 -> q2
//         while (!q1.isEmpty()) {
//             q2.add(q1.remove());
//         }

//         // Add new element
//         q1.add(x);

//         // Move q2 -> q1
//         while (!q2.isEmpty()) {
//             q1.add(q2.remove());
//         }
//     }

//     public int pop() {
//         return q1.remove();
//     }

//     public int top() {
//         return q1.peek();
//     }

//     public boolean empty() {
//         return q1.isEmpty();
//     }
// }
class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if (!queue1.isEmpty()) {
            queue1.add(x);
        } else {
            queue2.add(x);
        }
    }
    
    public int pop() {
        int peek = -1;

        if (empty()) {
            return peek;
        }

        if (!queue1.isEmpty()) {
            while (!queue1.isEmpty()) {
                peek = queue1.poll();
                if (!queue1.isEmpty()) {
                    queue2.add(peek);
                }
            }
        } else {
            while (!queue2.isEmpty()) {
                peek = queue2.poll();
                if (!queue2.isEmpty()) {
                    queue1.add(peek);
                }
            }
        }

        return peek;
    }
    
    public int top() {
        int peek = -1;

        if (empty()) {
            return peek;
        }

        if (!queue1.isEmpty()) {
            while (!queue1.isEmpty()) {
                peek = queue1.poll();
                queue2.add(peek);
            }
        } else {
            while (!queue2.isEmpty()) {
                peek = queue2.poll();
                queue1.add(peek);
            }
        }

        return peek;
    }
    
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */