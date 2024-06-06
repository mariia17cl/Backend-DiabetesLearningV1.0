package com.dawes.DiabetesLearning.servicioImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.dawes.DiabetesLearning.modelo.UsuarioVO;
import com.dawes.DiabetesLearning.repositorio.UsuarioRepository;
import com.dawes.DiabetesLearning.servicios.ServicioUsuario;

/**
 * Implementación del servicio para la entidad UsuarioVO. Proporciona las
 * operaciones de negocio relacionadas con los usuarios.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@Service

public class ServicioUsuarioImpl implements ServicioUsuario {
	@Autowired
	private UsuarioRepository ur;

	@Override
	public <S extends UsuarioVO> S save(S entity) {
		return ur.save(entity);
	}

	@Override
	public <S extends UsuarioVO> List<S> saveAll(Iterable<S> entities) {
		return ur.saveAll(entities);
	}

	@Override
	public <S extends UsuarioVO> Optional<S> findOne(Example<S> example) {
		return ur.findOne(example);
	}

	@Override
	public List<UsuarioVO> findAll(Sort sort) {
		return ur.findAll(sort);
	}

	@Override
	public void flush() {
		ur.flush();
	}

	@Override
	public Page<UsuarioVO> findAll(Pageable pageable) {
		return ur.findAll(pageable);
	}

	@Override
	public <S extends UsuarioVO> S saveAndFlush(S entity) {
		return ur.saveAndFlush(entity);
	}

	@Override
	public <S extends UsuarioVO> List<S> saveAllAndFlush(Iterable<S> entities) {
		return ur.saveAllAndFlush(entities);
	}

	@Override
	public List<UsuarioVO> findAll() {
		return ur.findAll();
	}

	@Override
	public List<UsuarioVO> findAllById(Iterable<Integer> ids) {
		return ur.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<UsuarioVO> entities) {
		ur.deleteInBatch(entities);
	}

	@Override
	public <S extends UsuarioVO> Page<S> findAll(Example<S> example, Pageable pageable) {
		return ur.findAll(example, pageable);
	}

	@Override
	public Optional<UsuarioVO> findById(Integer id) {
		return ur.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<UsuarioVO> entities) {
		ur.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return ur.existsById(id);
	}

	@Override
	public <S extends UsuarioVO> long count(Example<S> example) {
		return ur.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		ur.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends UsuarioVO> boolean exists(Example<S> example) {
		return ur.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		ur.deleteAllInBatch();
	}

	@Override
	public UsuarioVO getOne(Integer id) {
		return ur.getOne(id);
	}

	@Override
	public <S extends UsuarioVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return ur.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return ur.count();
	}

	@Override
	public void deleteById(Integer id) {
		ur.deleteById(id);
	}

	@Override
	public UsuarioVO getById(Integer id) {
		return ur.getById(id);
	}

	@Override
	public void delete(UsuarioVO entity) {
		ur.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		ur.deleteAllById(ids);
	}

	@Override
	public UsuarioVO getReferenceById(Integer id) {
		return ur.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends UsuarioVO> entities) {
		ur.deleteAll(entities);
	}

	@Override
	public <S extends UsuarioVO> List<S> findAll(Example<S> example) {
		return ur.findAll(example);
	}

	@Override
	public <S extends UsuarioVO> List<S> findAll(Example<S> example, Sort sort) {
		return ur.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		ur.deleteAll();
	}

}
