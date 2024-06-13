// Object * 14 Peg  ---  Spectroscopic Binary  ---  OID=@1525652   (@@31985,0)  ---  coobox=9664 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "14 Peg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "14 Peg"
	Class           "A1Vs"
	AbsMagn         0.529 // 计算的值
	MassKg          5.22639112260425e+30 // log(g) = 3.965 cm/s^2
	RadSol          2.795 // Gaia DR3
	LumBol          71.2865171146872 // 计算的值
	Teff            10032
	FeH             0.103

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.557059027
		Eccentricity    0.744740034
		Inclination     -0.650120974
		AscendingNode   0
		ArgOfPericenter -38.9662686
		MeanAnomaly     38.7560632
	}
}

Star "14 Peg B"
{
	ParentBody      "14 Peg"
	Class           "F2.6?"
}