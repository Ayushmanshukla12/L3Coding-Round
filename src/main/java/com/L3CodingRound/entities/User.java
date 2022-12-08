package com.L3CodingRound.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private int userX_Co_ordinate;
    private int userY_Co_ordinate;
    private String userName;
    @OneToMany(mappedBy = "user")
    private List<OrderDetails> orderList;
}
