package state.mn.us.dhs.helloworld001;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Employee {

    private int id;
    private String name;
    private String dept;
    private String email;
}
