package com.dawes.DiabetesLearning.servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.dawes.DiabetesLearning.modelo.CursoVO;

public interface ServicioCurso {

	<S extends CursoVO> S save(S entity);

	<S extends CursoVO> List<S> saveAll(Iterable<S> entities);

	<S extends CursoVO> Optional<S> findOne(Example<S> example);

	List<CursoVO> findAll(Sort sort);

	void flush();

	Page<CursoVO> findAll(Pageable pageable);

	<S extends CursoVO> S saveAndFlush(S entity);

	<S extends CursoVO> List<S> saveAllAndFlush(Iterable<S> entities);

	List<CursoVO> findAll();

	List<CursoVO> findAllById(Iterable<Integer> ids);

	void deleteInBatch(Iterable<CursoVO> entities);

	<S extends CursoVO> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<CursoVO> findById(Integer id);

	void deleteAllInBatch(Iterable<CursoVO> entities);

	boolean existsById(Integer id);

	<S extends CursoVO> long count(Example<S> example);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	<S extends CursoVO> boolean exists(Example<S> example);

	void deleteAllInBatch();

	CursoVO getOne(Integer id);

	<S extends CursoVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	long count();

	void deleteById(Integer id);

	CursoVO getById(Integer id);

	void delete(CursoVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	CursoVO getReferenceById(Integer id);

	void deleteAll(Iterable<? extends CursoVO> entities);

	<S extends CursoVO> List<S> findAll(Example<S> example);

	<S extends CursoVO> List<S> findAll(Example<S> example, Sort sort);

	void deleteAll();

}