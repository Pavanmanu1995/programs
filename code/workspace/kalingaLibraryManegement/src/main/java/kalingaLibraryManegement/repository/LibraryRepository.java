package kalingaLibraryManegement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kalingaLibraryManegement.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

}
