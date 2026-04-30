package dev.afinovicz.picpaysimplificado.repositories;

import dev.afinovicz.picpaysimplificado.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
