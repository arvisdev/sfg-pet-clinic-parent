/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 *
 * @author arvisdev
 */
public class BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    
}
