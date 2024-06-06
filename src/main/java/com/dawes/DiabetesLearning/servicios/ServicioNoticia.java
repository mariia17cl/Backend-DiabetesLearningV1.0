package com.dawes.DiabetesLearning.servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.dawes.DiabetesLearning.modelo.NoticiaVO;

public interface ServicioNoticia {

	<S extends NoticiaVO> S save(S entity);

	<S extends NoticiaVO> List<S> saveAll(Iterable<S> entities);

	<S extends NoticiaVO> Optional<S> findOne(Example<S> example);

	List<NoticiaVO> findAll(Sort sort);

	void flush();

	Page<NoticiaVO> findAll(Pageable pageable);

	<S extends NoticiaVO> S saveAndFlush(S entity);

	<S extends NoticiaVO> List<S> saveAllAndFlush(Iterable<S> entities);

	List<NoticiaVO> findAll();

	List<NoticiaVO> findAllById(Iterable<Integer> ids);

	void deleteInBatch(Iterable<NoticiaVO> entities);

	<S extends NoticiaVO> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<NoticiaVO> findById(Integer id);

	void deleteAllInBatch(Iterable<NoticiaVO> entities);

	boolean existsById(Integer id);

	<S extends NoticiaVO> long count(Example<S> example);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	<S extends NoticiaVO> boolean exists(Example<S> example);

	void deleteAllInBatch();

	NoticiaVO getOne(Integer id);

	<S extends NoticiaVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	long count();

	void deleteById(Integer id);

	NoticiaVO getById(Integer id);

	void delete(NoticiaVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	NoticiaVO getReferenceById(Integer id);

	void deleteAll(Iterable<? extends NoticiaVO> entities);

	<S extends NoticiaVO> List<S> findAll(Example<S> example);

	<S extends NoticiaVO> List<S> findAll(Example<S> example, Sort sort);

	void deleteAll();

}