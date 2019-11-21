package pe.etg.bbva.evalua.spring5.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pe.etg.bbva.evalua.spring5.entity.CE0401v01Customer;

@Component
public class CD0401v01CustomerCollection {
	// Dummy database. Initialize with some dummy values.
		private static List<CE0401v01Customer> CECustomers;
		{
			CECustomers = new ArrayList<CE0401v01Customer>();
			CECustomers.add(new CE0401v01Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
			CECustomers.add(new CE0401v01Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
			CECustomers.add(new CE0401v01Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
			CECustomers.add(new CE0401v01Customer(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736"));
		}

		/**
		 * Returns list of CECustomers from dummy database.
		 * 
		 * @return list of CECustomers
		 */
		public List<CE0401v01Customer> list() {
			return CECustomers;
		}

		/**
		 * Return CECustomer object for given id from dummy database. If CECustomer is
		 * not found for id, returns null.
		 * 
		 * @param id
		 *            CECustomer id
		 * @return CECustomer object for given id
		 */
		public CE0401v01Customer get(Long id) {

			for (CE0401v01Customer c : CECustomers) {
				if (c.getId().equals(id)) {
					return c;
				}
			}
			return null;
		}

		/**
		 * Create new CECustomer in dummy database. Updates the id and insert new
		 * CECustomer in list.
		 * 
		 * @param CECustomer
		 *            CECustomer object
		 * @return CECustomer object with updated id
		 */
		public CE0401v01Customer create(CE0401v01Customer CECustomer) {
			CECustomer.setId(System.currentTimeMillis());
			CECustomers.add(CECustomer);
			return CECustomer;
		}

		/**
		 * Delete the CECustomer object from dummy database. If CECustomer not found for
		 * given id, returns null.
		 * 
		 * @param id
		 *            the CECustomer id
		 * @return id of deleted CECustomer object
		 */
		public Long delete(Long id) {

			for (CE0401v01Customer c : CECustomers) {
				if (c.getId().equals(id)) {
					CECustomers.remove(c);
					return id;
				}
			}

			return null;
		}

		/**
		 * Update the CECustomer object for given id in dummy database. If CECustomer
		 * not exists, returns null
		 * 
		 * @param id
		 * @param CECustomer
		 * @return CECustomer object with id
		 */
		public CE0401v01Customer update(Long id, CE0401v01Customer CECustomer) {

			for (CE0401v01Customer c : CECustomers) {
				if (c.getId().equals(id)) {
					CECustomer.setId(c.getId());
					CECustomers.remove(c);
					CECustomers.add(CECustomer);
					return CECustomer;
				}
			}

			return null;
		}
}
