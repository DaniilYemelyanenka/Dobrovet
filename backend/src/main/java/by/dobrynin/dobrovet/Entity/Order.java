package by.dobrynin.dobrovet.Entity;

import by.dobrynin.dobrovet.Entity.persons.Client;
import by.dobrynin.dobrovet.Entity.products.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @Column(name = "product_list")
//    private List<Product> productList;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private int amount;

    @Column(name="total_price")
    private double totalPrice;


    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist(){
        createdAt = LocalDateTime.now();
        updatedAt = createdAt;
    }

    @PreUpdate
    public void preUpdate(){
        updatedAt = LocalDateTime.now();
    }
}
