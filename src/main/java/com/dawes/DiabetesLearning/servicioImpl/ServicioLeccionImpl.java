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

import com.dawes.DiabetesLearning.modelo.LeccionVO;
import com.dawes.DiabetesLearning.repositorio.LeccionRepository;
import com.dawes.DiabetesLearning.servicios.ServicioLeccion;

/**
 * Implementación del servicio para la entidad LeccionVO. Proporciona las
 * operaciones de negocio relacionadas con las lecciones.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@Service

public class ServicioLeccionImpl implements ServicioLeccion {
	@Autowired
	private LeccionRepository lr;

	@Override
	public <S extends LeccionVO> S save(S entity) {
		return lr.save(entity);
	}

	@Override
	public <S extends LeccionVO> List<S> saveAll(Iterable<S> entities) {
		return lr.saveAll(entities);
	}

	@Override
	public <S extends LeccionVO> Optional<S> findOne(Example<S> example) {
		return lr.findOne(example);
	}

	@Override
	public List<LeccionVO> findAll(Sort sort) {
		return lr.findAll(sort);
	}

	@Override
	public void flush() {
		lr.flush();
	}

	@Override
	public Page<LeccionVO> findAll(Pageable pageable) {
		return lr.findAll(pageable);
	}

	@Override
	public <S extends LeccionVO> S saveAndFlush(S entity) {
		return lr.saveAndFlush(entity);
	}

	@Override
	public <S extends LeccionVO> List<S> saveAllAndFlush(Iterable<S> entities) {
		return lr.saveAllAndFlush(entities);
	}

	@Override
	public List<LeccionVO> findAll() {
		return lr.findAll();
	}

	@Override
	public List<LeccionVO> findAllById(Iterable<Integer> ids) {
		return lr.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<LeccionVO> entities) {
		lr.deleteInBatch(entities);
	}

	@Override
	public <S extends LeccionVO> Page<S> findAll(Example<S> example, Pageable pageable) {
		return lr.findAll(example, pageable);
	}

	@Override
	public Optional<LeccionVO> findById(Integer id) {
		return lr.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<LeccionVO> entities) {
		lr.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return lr.existsById(id);
	}

	@Override
	public <S extends LeccionVO> long count(Example<S> example) {
		return lr.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		lr.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends LeccionVO> boolean exists(Example<S> example) {
		return lr.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		lr.deleteAllInBatch();
	}

	@Override
	public LeccionVO getOne(Integer id) {
		return lr.getOne(id);
	}

	@Override
	public <S extends LeccionVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return lr.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return lr.count();
	}

	@Override
	public void deleteById(Integer id) {
		lr.deleteById(id);
	}

	@Override
	public LeccionVO getById(Integer id) {
		return lr.getById(id);
	}

	@Override
	public void delete(LeccionVO entity) {
		lr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		lr.deleteAllById(ids);
	}

	@Override
	public LeccionVO getReferenceById(Integer id) {
		return lr.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends LeccionVO> entities) {
		lr.deleteAll(entities);
	}

	@Override
	public <S extends LeccionVO> List<S> findAll(Example<S> example) {
		return lr.findAll(example);
	}

	@Override
	public <S extends LeccionVO> List<S> findAll(Example<S> example, Sort sort) {
		return lr.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		lr.deleteAll();
	}

	/*
	 * @Override public List<LeccionVO> findByCursoId(Integer idcurso) { //
	 * Implementa la lógica para buscar las lecciones por ID de curso return
	 * lr.findByCursoId(idcurso); }
	 */
}
