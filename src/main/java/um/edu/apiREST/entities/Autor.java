package um.edu.apiREST.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Autor extends Base {
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column(length = 1500)
    private String biografia;
}
