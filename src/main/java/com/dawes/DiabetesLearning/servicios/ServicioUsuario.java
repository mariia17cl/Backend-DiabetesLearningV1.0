package com.dawes.DiabetesLearning.servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.dawes.DiabetesLearning.modelo.UsuarioVO;

public interface ServicioUsuario {

	<S extends UsuarioVO> S save(S entity);

	<S extends UsuarioVO> List<S> saveAll(Iterable<S> entities);

	<S extends UsuarioVO> Optional<S> findOne(Example<S> example);

	List<UsuarioVO> findAll(Sort sort);

	void flush();

	Page<UsuarioVO> findAll(Pageable pageable);

	<S extends UsuarioVO> S saveAndFlush(S entity);

	<S extends UsuarioVO> List<S> saveAllAndFlush(Iterable<S> entities);

	List<UsuarioVO> findAll();

	List<UsuarioVO> findAllById(Iterable<Integer> ids);

	void deleteInBatch(Iterable<UsuarioVO> entities);

	<S extends UsuarioVO> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<UsuarioVO> findById(Integer id);

	void deleteAllInBatch(Iterable<UsuarioVO> entities);

	boolean existsById(Integer id);

	<S extends UsuarioVO> long count(Example<S> example);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	<S extends UsuarioVO> boolean exists(Example<S> example);

	void deleteAllInBatch();

	UsuarioVO getOne(Integer id);

	<S extends UsuarioVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	long count();

	void deleteById(Integer id);

	UsuarioVO getById(Integer id);

	void delete(UsuarioVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	UsuarioVO getReferenceById(Integer id);

	void deleteAll(Iterable<? extends UsuarioVO> entities);

	<S extends UsuarioVO> List<S> findAll(Example<S> example);

	<S extends UsuarioVO> List<S> findAll(Example<S> example, Sort sort);

	void deleteAll();

}