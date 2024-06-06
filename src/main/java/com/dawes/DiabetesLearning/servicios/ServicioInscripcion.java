package com.dawes.DiabetesLearning.servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.dawes.DiabetesLearning.modelo.InscripcionVO;

public interface ServicioInscripcion {

	<S extends InscripcionVO> S save(S entity);

	<S extends InscripcionVO> List<S> saveAll(Iterable<S> entities);

	<S extends InscripcionVO> Optional<S> findOne(Example<S> example);

	List<InscripcionVO> findAll(Sort sort);

	void flush();

	Page<InscripcionVO> findAll(Pageable pageable);

	<S extends InscripcionVO> S saveAndFlush(S entity);

	<S extends InscripcionVO> List<S> saveAllAndFlush(Iterable<S> entities);

	List<InscripcionVO> findAll();

	List<InscripcionVO> findAllById(Iterable<Integer> ids);

	void deleteInBatch(Iterable<InscripcionVO> entities);

	<S extends InscripcionVO> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<InscripcionVO> findById(Integer id);

	void deleteAllInBatch(Iterable<InscripcionVO> entities);

	boolean existsById(Integer id);

	<S extends InscripcionVO> long count(Example<S> example);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	<S extends InscripcionVO> boolean exists(Example<S> example);

	void deleteAllInBatch();

	InscripcionVO getOne(Integer id);

	<S extends InscripcionVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	long count();

	void deleteById(Integer id);

	InscripcionVO getById(Integer id);

	void delete(InscripcionVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	InscripcionVO getReferenceById(Integer id);

	void deleteAll(Iterable<? extends InscripcionVO> entities);

	<S extends InscripcionVO> List<S> findAll(Example<S> example);

	<S extends InscripcionVO> List<S> findAll(Example<S> example, Sort sort);

	void deleteAll();

}