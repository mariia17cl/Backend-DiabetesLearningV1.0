package com.dawes.DiabetesLearning.servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.dawes.DiabetesLearning.modelo.LeccionVO;

public interface ServicioLeccion {

	<S extends LeccionVO> S save(S entity);

	<S extends LeccionVO> List<S> saveAll(Iterable<S> entities);

	<S extends LeccionVO> Optional<S> findOne(Example<S> example);

	List<LeccionVO> findAll(Sort sort);

	void flush();

	Page<LeccionVO> findAll(Pageable pageable);

	<S extends LeccionVO> S saveAndFlush(S entity);

	<S extends LeccionVO> List<S> saveAllAndFlush(Iterable<S> entities);

	List<LeccionVO> findAll();

	List<LeccionVO> findAllById(Iterable<Integer> ids);

	void deleteInBatch(Iterable<LeccionVO> entities);

	<S extends LeccionVO> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<LeccionVO> findById(Integer id);

	void deleteAllInBatch(Iterable<LeccionVO> entities);

	boolean existsById(Integer id);

	<S extends LeccionVO> long count(Example<S> example);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	<S extends LeccionVO> boolean exists(Example<S> example);

	void deleteAllInBatch();

	LeccionVO getOne(Integer id);

	<S extends LeccionVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	long count();

	void deleteById(Integer id);

	LeccionVO getById(Integer id);

	void delete(LeccionVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	LeccionVO getReferenceById(Integer id);

	void deleteAll(Iterable<? extends LeccionVO> entities);

	<S extends LeccionVO> List<S> findAll(Example<S> example);

	<S extends LeccionVO> List<S> findAll(Example<S> example, Sort sort);

	void deleteAll();

	// List<LeccionVO> findByCursoId(Integer idcurso);

}