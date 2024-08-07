// Object * 132 Tau  ---  Double or Multiple Star  ---  OID=@838514   (@@20413,4)  ---  coobox=4604 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "132 Tau A"
{
	ParentBody      "132 Tau"
	BinaryOrbit     
	{
		Epoch           2448258
		Separation      598.161573067479 // 3.8 asec
		PositionAngle   230
	}
}

Star "132 Tau Aa"
{
	DateUpdated     "2024-07-02"
	ParentBody      "132 Tau A"
	Class           "G9III"
	AbsMagn         -1.11 // 计算的值
	Teff            4853
	FeH             0.18

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.440629493
		Eccentricity    0
		Inclination     -0.465817451
		AscendingNode   0
		ArgOfPericenter 61.8723023
		MeanAnomaly     98.9523239
	}
}

Star "132 Tau Ab"
{
	ParentBody      "132 Tau A"
	Class           "F1.3?"
}

Star "132 Tau B"
{
	ParentBody      "132 Tau"
	Class           "F6.8?"
}