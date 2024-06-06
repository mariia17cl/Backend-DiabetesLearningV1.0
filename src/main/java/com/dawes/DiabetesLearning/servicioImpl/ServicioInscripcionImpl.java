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

import com.dawes.DiabetesLearning.modelo.InscripcionVO;
import com.dawes.DiabetesLearning.repositorio.InscripcionRepository;
import com.dawes.DiabetesLearning.servicios.ServicioInscripcion;

/**
 * Implementación del servicio para la entidad InscripcionVO. Proporciona las
 * operaciones de negocio relacionadas con las inscripciones.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@Service

public class ServicioInscripcionImpl implements ServicioInscripcion {

	@Autowired
	private InscripcionRepository ir;

	@Override
	public <S extends InscripcionVO> S save(S entity) {
		return ir.save(entity);
	}

	@Override
	public <S extends InscripcionVO> List<S> saveAll(Iterable<S> entities) {
		return ir.saveAll(entities);
	}

	@Override
	public <S extends InscripcionVO> Optional<S> findOne(Example<S> example) {
		return ir.findOne(example);
	}

	@Override
	public List<InscripcionVO> findAll(Sort sort) {
		return ir.findAll(sort);
	}

	@Override
	public void flush() {
		ir.flush();
	}

	@Override
	public Page<InscripcionVO> findAll(Pageable pageable) {
		return ir.findAll(pageable);
	}

	@Override
	public <S extends InscripcionVO> S saveAndFlush(S entity) {
		return ir.saveAndFlush(entity);
	}

	@Override
	public <S extends InscripcionVO> List<S> saveAllAndFlush(Iterable<S> entities) {
		return ir.saveAllAndFlush(entities);
	}

	@Override
	public List<InscripcionVO> findAll() {
		return ir.findAll();
	}

	@Override
	public List<InscripcionVO> findAllById(Iterable<Integer> ids) {
		return ir.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<InscripcionVO> entities) {
		ir.deleteInBatch(entities);
	}

	@Override
	public <S extends InscripcionVO> Page<S> findAll(Example<S> example, Pageable pageable) {
		return ir.findAll(example, pageable);
	}

	@Override
	public Optional<InscripcionVO> findById(Integer id) {
		return ir.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<InscripcionVO> entities) {
		ir.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return ir.existsById(id);
	}

	@Override
	public <S extends InscripcionVO> long count(Example<S> example) {
		return ir.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		ir.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends InscripcionVO> boolean exists(Example<S> example) {
		return ir.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		ir.deleteAllInBatch();
	}

	@Override
	public InscripcionVO getOne(Integer id) {
		return ir.getOne(id);
	}

	@Override
	public <S extends InscripcionVO, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return ir.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return ir.count();
	}

	@Override
	public void deleteById(Integer id) {
		ir.deleteById(id);
	}

	@Override
	public InscripcionVO getById(Integer id) {
		return ir.getById(id);
	}

	@Override
	public void delete(InscripcionVO entity) {
		ir.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		ir.deleteAllById(ids);
	}

	@Override
	public InscripcionVO getReferenceById(Integer id) {
		return ir.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends InscripcionVO> entities) {
		ir.deleteAll(entities);
	}

	@Override
	public <S extends InscripcionVO> List<S> findAll(Example<S> example) {
		return ir.findAll(example);
	}

	@Override
	public <S extends InscripcionVO> List<S> findAll(Example<S> example, Sort sort) {
		return ir.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		ir.deleteAll();
	}

}
