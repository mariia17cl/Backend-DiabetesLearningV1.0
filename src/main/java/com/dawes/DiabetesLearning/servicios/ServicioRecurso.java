package com.dawes.DiabetesLearning.servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.dawes.DiabetesLearning.modelo.RecursoVO;

public interface ServicioRecurso {

	<S extends RecursoVO> S save(S entity);

	<S extends RecursoVO> List<S> saveAll(Iterable<S> entities);

	<S extends RecursoVO> Optional<S> findOne(Example<S> example);

	List<RecursoVO> findAll(Sort sort);

	void flush();

	Page<RecursoVO> findAll(Pageable pageable);

	<S extends RecursoVO> S saveAndFlush(S entity);

	<S extends RecursoVO> List<S> saveAllAndFlush(Iterable<S> entities);

	List<RecursoVO> findAll();

	List<RecursoVO> findAllById(Iterable<Integer> ids);

	void deleteInBatch(Iterable<RecursoVO> entities);

	<S extends RecursoVO> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<RecursoVO> findById(Integer id);

	void deleteAllInBatch(Iterable<RecursoVO> entities);

	boolean existsById(Integer id);

	<S extends RecursoVO> long count(Example<S> example);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	<S extends RecursoVO> boolean exists(Example<S> example);

	void deleteAllInBatch();

	RecursoVO getOne(Integer id);

	<S extends RecursoVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	long count();

	void deleteById(Integer id);

	RecursoVO getById(Integer id);

	void delete(RecursoVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	RecursoVO getReferenceById(Integer id);

	void deleteAll(Iterable<? extends RecursoVO> entities);

	<S extends RecursoVO> List<S> findAll(Example<S> example);

	<S extends RecursoVO> List<S> findAll(Example<S> example, Sort sort);

	void deleteAll();

}