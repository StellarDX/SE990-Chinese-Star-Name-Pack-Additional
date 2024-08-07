// Object * 14 Vir  ---  Star  ---  OID=@1919305   (@@39724,10)  ---  coobox=15405 
// Object types: Red Giant Branch star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "14 Vir A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "14 Vir"
	Class           "K0III"
	AbsMagn         0.375 // 计算的值
	MassKg          5.18644813903832e+30 // log(g) = 2.61 cm/s^2
	RadSol          13.25 // Gaia DR3
	LumBol          93.4357577324176 // 计算的值
	Teff            4930
	FeH             -0.046

	BinaryOrbit     
	{
		Separation      655.494442598349 // 3.36 asec
	}
}

Star "14 Vir B"
{
	ParentBody      "14 Vir"
	Class           "A6.3?"
}

// Object * 31 Crt  ---  Spectroscopic Binary  ---  OID=@1894442   (@@38860,11)  ---  coobox=15522 
// Object types: Ellipsoidal Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,UV-emission Source 
Star "31 Crt A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "31 Crt"
	Class           "B1.5V"
	AbsMagn         -3.6 // 计算的值
	MassSol         15.5
	Radius          9433470.26817865 // 计算的值
	LumBol          52262
	Teff            23700
	Oblateness      0

	BinaryOrbit     
	{
		PeriodDays      2.9631
	}
}

Star "31 Crt B"
{
	ParentBody      "31 Crt"
	Class           "B2.9?"
}