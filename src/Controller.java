import java.util.List;

public class Controller {
    private final StudentGroupServise studentGroupServise = new StudentGroupServise();
    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO(String firstName, String secondName, String patronymic) {
        studentGroupServise.removeStudentByFIO(firstName, secondName, patronymic);
    }

    public List<Student> getSortedStudentList() {
       return studentGroupServise.getSortedStudentList();

    }

    public List<Student> getSortedStudentByFIO(){
      return studentGroupServise.getSortedStudentByFIO();
    }

    public List<FlowOfStudyGroups> getSortedStreamList() {
        return streamService.getSortedStreamList();  // Вызов метода сортировки потоков
    }

    public void addStream(FlowOfStudyGroups stream) {
        streamService.addStream(stream);
    }
    public void sortStreams() {
        streamService.sortStreams(); // Сортировка списка потоков
    }
}



