/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    int ans;
    public int getImportance(List<Employee> employees, int id) {
        ans=0;
        helper(employees, id);
        return ans;
    }
    
    public void helper(List<Employee> employees, int id){
        for(Employee emp: employees){
            if(emp.id==id) {
                ans+=emp.importance;
                for(int eid: emp.subordinates){
                    helper(employees, eid);
                }
            }
        }
    }
}