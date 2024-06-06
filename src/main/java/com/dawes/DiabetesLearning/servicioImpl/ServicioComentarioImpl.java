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

import com.dawes.DiabetesLearning.modelo.ComentarioVO;
import com.dawes.DiabetesLearning.repositorio.ComentarioRepository;
import com.dawes.DiabetesLearning.servicios.ServicioComentario;

/**
 * Implementación del servicio para la entidad ComentarioVO. Proporciona las
 * operaciones de negocio relacionadas con los comentarios.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@Service

public class ServicioComentarioImpl implements ServicioComentario {
	@Autowired
	private ComentarioRepository cr;

	@Override
	public <S extends ComentarioVO> S save(S entity) {
		return cr.save(entity);
	}

	@Override
	public <S extends ComentarioVO> List<S> saveAll(Iterable<S> entities) {
		return cr.saveAll(entities);
	}

	@Override
	public <S extends ComentarioVO> Optional<S> findOne(Example<S> example) {
		return cr.findOne(example);
	}

	@Override
	public List<ComentarioVO> findAll(Sort sort) {
		return cr.findAll(sort);
	}

	@Override
	public void flush() {
		cr.flush();
	}

	@Override
	public Page<ComentarioVO> findAll(Pageable pageable) {
		return cr.findAll(pageable);
	}

	@Override
	public <S extends ComentarioVO> S saveAndFlush(S entity) {
		return cr.saveAndFlush(entity);
	}

	@Override
	public <S extends ComentarioVO> List<S> saveAllAndFlush(Iterable<S> entities) {
		return cr.saveAllAndFlush(entities);
	}

	@Override
	public List<ComentarioVO> findAll() {
		return cr.findAll();
	}

	@Override
	public List<ComentarioVO> findAllById(Iterable<Integer> ids) {
		return cr.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<ComentarioVO> entities) {
		cr.deleteInBatch(entities);
	}

	@Override
	public <S extends ComentarioVO> Page<S> findAll(Example<S> example, Pageable pageable) {
		return cr.findAll(example, pageable);
	}

	@Override
	public Optional<ComentarioVO> findById(Integer id) {
		return cr.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<ComentarioVO> entities) {
		cr.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return cr.existsById(id);
	}

	@Override
	public <S extends ComentarioVO> long count(Example<S> example) {
		return cr.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		cr.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends ComentarioVO> boolean exists(Example<S> example) {
		return cr.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		cr.deleteAllInBatch();
	}

	@Override
	public ComentarioVO getOne(Integer id) {
		return cr.getOne(id);
	}

	@Override
	public <S extends ComentarioVO, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return cr.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return cr.count();
	}

	@Override
	public void deleteById(Integer id) {
		cr.deleteById(id);
	}

	@Override
	public ComentarioVO getById(Integer id) {
		return cr.getById(id);
	}

	@Override
	public void delete(ComentarioVO entity) {
		cr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		cr.deleteAllById(ids);
	}

	@Override
	public ComentarioVO getReferenceById(Integer id) {
		return cr.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends ComentarioVO> entities) {
		cr.deleteAll(entities);
	}

	@Override
	public <S extends ComentarioVO> List<S> findAll(Example<S> example) {
		return cr.findAll(example);
	}

	@Override
	public <S extends ComentarioVO> List<S> findAll(Example<S> example, Sort sort) {
		return cr.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		cr.deleteAll();
	}

}
