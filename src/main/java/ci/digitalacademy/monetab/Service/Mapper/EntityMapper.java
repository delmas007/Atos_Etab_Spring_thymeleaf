package ci.digitalacademy.monetab.Service.Mapper;

public interface EntityMapper <D, E> {
    D fromEntity(E entity);
    E toEntity(D dto);

}
