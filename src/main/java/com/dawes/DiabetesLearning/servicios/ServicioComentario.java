package com.dawes.DiabetesLearning.servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.dawes.DiabetesLearning.modelo.ComentarioVO;

public interface ServicioComentario {

	<S extends ComentarioVO> S save(S entity);

	<S extends ComentarioVO> List<S> saveAll(Iterable<S> entities);

	<S extends ComentarioVO> Optional<S> findOne(Example<S> example);

	List<ComentarioVO> findAll(Sort sort);

	void flush();

	Page<ComentarioVO> findAll(Pageable pageable);

	<S extends ComentarioVO> S saveAndFlush(S entity);

	<S extends ComentarioVO> List<S> saveAllAndFlush(Iterable<S> entities);

	List<ComentarioVO> findAll();

	List<ComentarioVO> findAllById(Iterable<Integer> ids);

	void deleteInBatch(Iterable<ComentarioVO> entities);

	<S extends ComentarioVO> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<ComentarioVO> findById(Integer id);

	void deleteAllInBatch(Iterable<ComentarioVO> entities);

	boolean existsById(Integer id);

	<S extends ComentarioVO> long count(Example<S> example);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	<S extends ComentarioVO> boolean exists(Example<S> example);

	void deleteAllInBatch();

	ComentarioVO getOne(Integer id);

	<S extends ComentarioVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	long count();

	void deleteById(Integer id);

	ComentarioVO getById(Integer id);

	void delete(ComentarioVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	ComentarioVO getReferenceById(Integer id);

	void deleteAll(Iterable<? extends ComentarioVO> entities);

	<S extends ComentarioVO> List<S> findAll(Example<S> example);

	<S extends ComentarioVO> List<S> findAll(Example<S> example, Sort sort);

	void deleteAll();

}