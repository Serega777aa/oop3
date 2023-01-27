public class Group extends Departament{
    public Group(String GropName){
        setDeptName(GropName);
    }

    public void addPeople(Persona persona){
        personaInDept.add(persona);
    }
}
