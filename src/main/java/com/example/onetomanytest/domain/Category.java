package com.example.onetomanytest.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.procedure.ProcedureOutputs;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="category_id_fk")
    private List<Product> products=new ArrayList<>();
}
