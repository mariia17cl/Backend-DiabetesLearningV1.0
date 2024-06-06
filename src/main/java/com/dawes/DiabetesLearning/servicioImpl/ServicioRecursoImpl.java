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

import com.dawes.DiabetesLearning.modelo.RecursoVO;
import com.dawes.DiabetesLearning.repositorio.RecursoRepository;
import com.dawes.DiabetesLearning.servicios.ServicioRecurso;

/**
 * Implementación del servicio para la entidad RecursoVO. Proporciona las
 * operaciones de negocio relacionadas con los recursos.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@Service

public class ServicioRecursoImpl implements ServicioRecurso {

	@Autowired
	private RecursoRepository rr;

	@Override
	public <S extends RecursoVO> S save(S entity) {
		return rr.save(entity);
	}

	@Override
	public <S extends RecursoVO> List<S> saveAll(Iterable<S> entities) {
		return rr.saveAll(entities);
	}

	@Override
	public <S extends RecursoVO> Optional<S> findOne(Example<S> example) {
		return rr.findOne(example);
	}

	@Override
	public List<RecursoVO> findAll(Sort sort) {
		return rr.findAll(sort);
	}

	@Override
	public void flush() {
		rr.flush();
	}

	@Override
	public Page<RecursoVO> findAll(Pageable pageable) {
		return rr.findAll(pageable);
	}

	@Override
	public <S extends RecursoVO> S saveAndFlush(S entity) {
		return rr.saveAndFlush(entity);
	}

	@Override
	public <S extends RecursoVO> List<S> saveAllAndFlush(Iterable<S> entities) {
		return rr.saveAllAndFlush(entities);
	}

	@Override
	public List<RecursoVO> findAll() {
		return rr.findAll();
	}

	@Override
	public List<RecursoVO> findAllById(Iterable<Integer> ids) {
		return rr.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<RecursoVO> entities) {
		rr.deleteInBatch(entities);
	}

	@Override
	public <S extends RecursoVO> Page<S> findAll(Example<S> example, Pageable pageable) {
		return rr.findAll(example, pageable);
	}

	@Override
	public Optional<RecursoVO> findById(Integer id) {
		return rr.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<RecursoVO> entities) {
		rr.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return rr.existsById(id);
	}

	@Override
	public <S extends RecursoVO> long count(Example<S> example) {
		return rr.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		rr.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends RecursoVO> boolean exists(Example<S> example) {
		return rr.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		rr.deleteAllInBatch();
	}

	@Override
	public RecursoVO getOne(Integer id) {
		return rr.getOne(id);
	}

	@Override
	public <S extends RecursoVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return rr.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return rr.count();
	}

	@Override
	public void deleteById(Integer id) {
		rr.deleteById(id);
	}

	@Override
	public RecursoVO getById(Integer id) {
		return rr.getById(id);
	}

	@Override
	public void delete(RecursoVO entity) {
		rr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		rr.deleteAllById(ids);
	}

	@Override
	public RecursoVO getReferenceById(Integer id) {
		return rr.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends RecursoVO> entities) {
		rr.deleteAll(entities);
	}

	@Override
	public <S extends RecursoVO> List<S> findAll(Example<S> example) {
		return rr.findAll(example);
	}

	@Override
	public <S extends RecursoVO> List<S> findAll(Example<S> example, Sort sort) {
		return rr.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		rr.deleteAll();
	}

}
